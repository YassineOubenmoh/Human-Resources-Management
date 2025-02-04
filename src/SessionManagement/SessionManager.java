/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SessionManagement;

/**
 *
 * @author Abdellatif
 */

import java.util.HashMap;

public class SessionManager {
    private static SessionManager instance;
    private HashMap<String, Object> sessionData;

    private SessionManager() {
        sessionData = new HashMap<>();
    }

    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public void setSessionData(String key, Object value) {
        sessionData.put(key, value);
    }

    public Object getSessionData(String key) {
        return sessionData.get(key);
    }

    public void clearSessionData() {
        sessionData.clear();
    }
}
