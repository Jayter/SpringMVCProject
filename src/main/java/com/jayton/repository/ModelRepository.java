package main.java.com.jayton.repository;

import main.java.com.jayton.model.Model;

/**
 * Created by Jayton on 19.02.2018.
 */
public interface ModelRepository {
    int saveModel(Model model);
    Model getModel(int id);
    boolean removeModel(int id);
    Model editModel(Model model);
}
