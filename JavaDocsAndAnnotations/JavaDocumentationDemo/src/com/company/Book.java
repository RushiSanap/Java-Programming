/**
 * @author Rushikesh Sanap
 * @version 2.0
 * @since 2015
 */

package com.company;

/**
 * @author Rushikesh Sanap
 * class for library book
 */

public class Book
{
    /**
     * @value 10 default value
     */
    static private int val = 10;

    /**
     * parameterised constructor
     * @param s book name
     */
    public Book(String s) { }

    /**
     *Issue a book to a student
     * @param roll number of the student
     * @throws Exception if the book is not available throws exceptions
     */
    public void issue(int roll) throws Exception{}

    /**
     * check if book available or not
     * @param str Book name
     * @return if the book is available return true else false
     */
    public boolean available(String str){return true;}

    /**
     * Get book name
     * @param id Book id
     * @return return the name of the book
     */
    public String getName(int id) { return ""; }
}

