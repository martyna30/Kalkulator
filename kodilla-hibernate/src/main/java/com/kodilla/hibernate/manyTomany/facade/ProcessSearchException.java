package com.kodilla.hibernate.manyTomany.facade;

public class ProcessSearchException extends Exception {
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee with this String character wasn't found";
    public static String ERR_COMPANY_NOT_FOUND = "Company with this String character wasn't found";
    public static String ERR_COMPANY_WRITE_ERROR_TO_DATABASE = "Companies don't exist in the Database";
    public static String ERR_EMPLOYEES_WRITE_ERROR_TO_DATABASE = "Employees don't exist in the Database";

    public ProcessSearchException(String message) {
        super(message);
    }
}

