package mg.tojooooo.frameworktest;

import mg.tojooooo.framework.Router;
import mg.tojooooo.framework.RouterEngine;
public class Main {
    public static void main(String[] args) {

        Router router = new Router();        
        RouterEngine engine = new RouterEngine(router);
        
        System.out.println("=== TEST DU ROUTAGE ===");
        
        engine.handleRequest("/");
        engine.handleRequest("/users");
        engine.handleRequest("/products");
        engine.handleRequest("/contact");
        engine.handleRequest("/about"); // Cette URL n'existe pas
    }
}