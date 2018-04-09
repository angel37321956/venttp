package com.venttp.dwr.center;

import com.venttp.index.dto.UserCenterInfo;
import org.directwebremoting.Browser;
import org.directwebremoting.Container;
import org.directwebremoting.ScriptBuffer;
import org.directwebremoting.ScriptSession;
import org.directwebremoting.ScriptSessionFilter;
import org.directwebremoting.ServerContextFactory;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.event.ScriptSessionEvent;
import org.directwebremoting.event.ScriptSessionListener;
import org.directwebremoting.extend.ScriptSessionManager;
import org.directwebremoting.servlet.DwrServlet;

import javax.servlet.http.HttpSession;
import java.util.Collection;

public class SendMessage {
    public void onPageLoad (String userId) {
        ScriptSession scriptSession = WebContextFactory.get().getScriptSession();
        scriptSession.setAttribute("userId", userId);
        DwrScriptSessionManagerUtil dwrScriptSessionManager = new DwrScriptSessionManagerUtil();
        dwrScriptSessionManager.init();
    }

    public void sendMsg (String userid, String message, String jsFuc) {
        final String userId = userid;
        final String msg = message;
        final String jsFunc = jsFuc;
        Browser.withAllSessionsFiltered(new ScriptSessionFilter() {
            @Override
            public boolean match(ScriptSession scriptSession) {
                if (scriptSession.getAttribute("userId") == null) {
                    return false;
                } else {
                    return (scriptSession.getAttribute("userId")).equals(userId);
                }
            }
        }, new Runnable(){
            private ScriptBuffer scriptBuffer = new ScriptBuffer();
            public void run () {
                //推送消息
                scriptBuffer.appendCall(jsFunc,msg);
                Collection<ScriptSession> scriptSessions = Browser.getTargetSessions();
                for (ScriptSession scriptSession : scriptSessions) {
                    scriptSession.addScript(scriptBuffer);
                }
            }
        });

    }
}

class DwrScriptSessionManagerUtil extends DwrServlet {
    public void init () {
        Container container = ServerContextFactory.get().getContainer();
        ScriptSessionManager manager = container.getBean(ScriptSessionManager.class);
        ScriptSessionListener listener = new ScriptSessionListener() {
            @Override
            public void sessionCreated(ScriptSessionEvent scriptSessionEvent) {
                HttpSession session = WebContextFactory.get().getSession();
                UserCenterInfo userCenterInfo = (UserCenterInfo) session.getAttribute("userInfo");
                String userId = userCenterInfo.getUserId();
                System.out.println("a message created!");
                scriptSessionEvent.getSession().setAttribute("userId", userId);
            }

            @Override
            public void sessionDestroyed(ScriptSessionEvent scriptSessionEvent) {

                System.out.println("a message is destroyed!s");
            }
        };
        manager.addScriptSessionListener(listener);
    }
}