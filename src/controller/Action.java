package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Action {
    // Returns the name of the action, used to match the request in the hash table
    public abstract String getName();

    // Returns the name of the jsp used to render the output.
    public abstract String perform(HttpServletRequest request, HttpServletResponse response);

    //
    // Class methods to manage dispatching to Actions
    //
    private static Map<String, Action> hash = new HashMap<String, Action>();

    public static void add(Action a) {
        synchronized (hash) {
            if (hash.get(a.getName()) != null) {
                throw new AssertionError("Two actions with the same name (" + a.getName() + "): "
                        + a.getClass().getName() + " and " + hash.get(a.getName()).getClass().getName());
            }

            hash.put(a.getName(), a);
        }
    }

    public static String perform(String name, HttpServletRequest request, HttpServletResponse response) throws ServletException {
        Action a;
        synchronized (hash) {
            a = hash.get(name);
        }

        if (a == null)
            return null;
        return a.perform(request, response);
    }
}
