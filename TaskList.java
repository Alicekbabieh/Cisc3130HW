/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.brooklyncollege.cisc3130.project.organizedtodolistapplication;

/* Double Linked List  
*/

// need to import LinkedList and Iterator
import java.util.LinkedList;
import java.util.Iterator;
public class TaskList <T extends Task> extends LinkedList<T> implements Iterable<T> {

    // ADD methods
    
    // overriding add method - adds last elements to linked list
    // use super. since want it from super class
    @Override
    public boolean add(T elt) {
           return super.add(elt);
    }
    
    // need to override get method since already in Linked List class 
    // cal super. since want it from super class 
    // get(index) - calling the superclass methoda and enter the param 
    @Override
    public T get(int index) {
        return super.get(index);
    }

    // need to override the size method since from linked list class 
    // call super - since super class
    @Override
    public int size() {
        return super.size();
    }
    // deals with duplicates and Iterator 
    public boolean containsTask(String taskName) {
        Iterator<T> iterator = iterator();  
        // need loop if it iterators keeps going
        // constant time 
        while (iterator.hasNext()) {
            T task = iterator.next(); 
            // checking if duplicates if it does return true if not false
            if (task.getTaskName().equals(taskName)) {
                return true;  
            }
        }
        return false;
    }
}



    

