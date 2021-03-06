import models.Cohort;
import models.Student;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;


public class Controller {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        Cohort e23 = new Cohort("E23");

        get("/random", (req, res) -> {

            Student randomStudent = e23.selectRandomStudent();

            HashMap<String, Object> model = new HashMap<>();
            model.put("randomStudent", randomStudent);
            model.put("template", "randomStudent.vtl");

            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);



        get("/pair", (req, res) -> {

            ArrayList<Student> randomPair = e23.selectRandomPair();

            HashMap<String, Object> model = new HashMap<>();
            model.put("randomPair", randomPair);
            model.put("template", "randomPair.vtl");

            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);

        get("/pairs", (req, res) -> {

            ArrayList<ArrayList<Student>> randomPairs = e23.generateRandomPairs();

            HashMap<String, Object> model = new HashMap<>();
            model.put("randomPairs", randomPairs);
            model.put("template", "randomPairs.vtl");

            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);


        get("/group/:size", (req, res) -> {

            Integer groupSize = Integer.parseInt(req.params(":size"));

            ArrayList<Student> randomGroup = e23.selectRandomGroup(groupSize);

            HashMap<String, Object> model = new HashMap<>();
            model.put("randomGroup", randomGroup);
            model.put("template", "randomGroup.vtl");

            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);


        get("/groups/:size", (req, res) -> {

            Integer groupSize = Integer.parseInt(req.params(":size"));

            ArrayList<ArrayList<Student>> randomGroups = e23.generateRandomGroups(groupSize);

            HashMap<String, Object> model = new HashMap<>();
            model.put("randomGroups", randomGroups);
            model.put("template", "randomGroups.vtl");

            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);

    }

}
