package com.example.moduleseven;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity
{
   @Override
   protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      ListView courseListView = (ListView)findViewById(R.id.lvCourses);

      Course CST300 = new Course(
            300,
            getString(R.string.name300),
            getString(R.string.desc300));

      Course CST338 = new Course(
            338,
            getString(R.string.name338),
            getString(R.string.desc338));

      ArrayList<Course> courseList = new ArrayList<>();
      courseList.add(CST300);
      courseList.add(CST338);

      SimpleAdapter courseAdapter = new SimpleAdapter(this,courseList,android.R.layout.simple_list_item_2,
   }

}

class Course {
   private int id;
   private String name;
   private String description;


   public Course(int id, String name, String description)
   {
      this.id = id;
      this.name = name;
      this.description = description;
   }

   public int getId()
   {
      return id;
   }

   public void setId(int id)
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