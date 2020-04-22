package com.example.moduleseven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity
{
   Map<Course, Integer> courseMap = new HashMap<Course, Integer>();;
   private Boolean classMapCreated = false;
   @Override
   protected void onCreate(Bundle savedInstanceState)
   {
      courseMap = initialize(courseMap);
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
   }

   Map<Course, Integer> initialize(Map<Course,Integer> courseMap) {
      if (classMapCreated == true) {
         return courseMap;
      }
      else {
         courseMap.put(new Course("CST300","Major Pro Seminar",
               "Helps students identify and articulate personal, " +
                     "professional, and social goals. Provides an integrated " +
                     "overview of the computer science and communication " +
                     "design majors and their requirements. Students develop" +
                     " a plan for their learning goals. Students learn " +
                     "writing, presentation, research and critical-thinking " +
                     "skills within the diversified fields of information " +
                     "technology and communication design. Students learn " +
                     "how to analyze, predict, and articulate trends in the " +
                     "academic, public service,"), 300);
         courseMap.put(new Course("CST338","Software Engineering",
               "Provides students with the fundamental concepts to " +
                     "develop large-scale software, focusing on the " +
                     "object-oriented programming techniques. Coverage " +
                     "includes the introduction to Java programming language," +
                     " object-oriented programming, software life cycle and " +
                     "development processes, requirements analysis, and " +
                     "graphical user interface development."), 338);
         return courseMap;
      }
   }
}

class Course {
   private String id;
   private String name;
   private String description;


   public Course(String id, String name, String description)
   {
      this.id = id;
      this.name = name;
      this.description = description;
   }

   public String getId()
   {
      return id;
   }

   public void setId(String id)
   {
      this.id = id;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }
}
