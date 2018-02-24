/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarraylistwithbugs;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author micha
 */
public class MyArrayListWithBugsTest {

    public MyArrayListWithBugsTest() {
    }

    /**
     * Test of add method, of class MyArrayListWithBugs.
     */
    @Test
    public void testAdd_Object() {
        System.out.println("add");
        Object o = new Object();
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.add(o);
        assertEquals(instance.get(instance.size() - 1), o);
    }

    /**
     * Test of size method, of class MyArrayListWithBugs.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class MyArrayListWithBugs.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Object o = new Object();
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        for (int i = 0; i < 5; i++) {
            instance.add(o);
        }
        Object expResult = o;
        Object result = instance.get(instance.size() -1);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class MyArrayListWithBugs.
     */
    @Test
    public void testAdd_int_Object() {
        System.out.println("add int object");
        int index = 0;
        Object o = new Object();
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.add(index, o);
        assertEquals(instance.get(instance.size()), o);
    }

    /**
     * Test of remove method, of class MyArrayListWithBugs.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object o = new Object();
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.add(o);
        int index = 0;
        instance.remove(index);
        Object expResult = null;
        Object result = instance.get(index);
        assertEquals(expResult, result);
    }
    
    /**
     * 
     */
    @Test (expected = IndexOutOfBoundsException.class)
    public void testRemoveOnEmptyList(){
        System.out.println("remove object on empty list");
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.remove(2);
    }

    /**
     * 
     */
    @Test (expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds(){
        System.out.println("Get object on index out of bounds");
        Object o = new Object();
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.add(o);
        instance.get(2);
    }
    
    /**
     * 
     */
    @Test (expected = IndexOutOfBoundsException.class)
    public void testAddOutOfBounds(){
        System.out.println("Add object on index out of bounds");
        Object o = new Object();
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.add(2, o);
    }
}
