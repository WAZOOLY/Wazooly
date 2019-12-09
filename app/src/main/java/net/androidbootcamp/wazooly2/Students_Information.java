package net.androidbootcamp.wazooly2;

import java.util.ArrayList;
import java.util.HashMap;

public class Students_Information {
    private static ArrayList<Students_Information> studentList = new ArrayList<Students_Information>();
    // Vehicle Tag Number and Students_Information
    private static HashMap<String, Students_Information> students = new HashMap<String, Students_Information>() {
        {
            put("XYHKLF", new Students_Information("John", "Brown", "0428", "XYHKLF", "FL", 2016, "Red", "Rolls Royce", "Ghost"));
            put("1652HS", new Students_Information("Joe", "Smith", "0254", "1652HS", "VA", 2001, "Blue", "Honda", "Civic"));
            put("IKN312", new Students_Information("Ruth", "Wilson", "6520", "IKN312", "MD", 1998, "Green", "Nissan", "Rouge"));
            put("MOMLUV", new Students_Information("Mason", "Hunter", "4785", "MOMLUV", "CA", 2015, "Brown", "Hyundai", "Genesis"));
            put("HAPPY2", new Students_Information("Susan", "Job", "0236", "HAPPY2", "FL", 1922, "Gray", "Toyota", "Supra"));
        }
    };
    private String studentFName;
    private String studentLName;
    private String studentId;
    private String vehicleTagNumber;
    private String vehicleTagState;
    private int vehicleYear;
    private String vehicleColor;
    private String vehicleMake;
    private String vehicleModel;

    public Students_Information(String studentFName, String studentLName, String studentId, String vehicleTagNumber, String vehicleTagState, int vehicleYear, String vehicleColor, String vehicleMake, String vehicleModel) {
        this.studentFName = studentFName;
        this.studentLName = studentLName;
        this.studentId = studentId;
        this.vehicleTagNumber = vehicleTagNumber;
        this.vehicleTagState = vehicleTagState;
        this.vehicleYear = vehicleYear;
        this.vehicleColor = vehicleColor;
        this.vehicleModel = vehicleMake;
        this.vehicleModel = vehicleModel;
    }

    public static void createStudentPickupList(String vehicleTagNumber, String vehicleTagState) {
        studentList.add(new Students_Information(students.get(vehicleTagNumber).getStudentFName(), students.get(vehicleTagNumber).getStudentLName(), students.get(vehicleTagNumber).getStudentId(),
                students.get(vehicleTagNumber).getVehicleTagNumber(), students.get(vehicleTagNumber).getVehicleTagState(), students.get(vehicleTagNumber).getVehicleYear(),
                students.get(vehicleTagNumber).getVehicleColor(), students.get(vehicleTagNumber).getVehicleMake(), students.get(vehicleTagNumber).getVehicleModel()));
    }

    public static boolean searchForVehicle(String vehicleTagNumber, String vehicleTagState) {
        if (students.containsKey(vehicleTagNumber)) {
            return vehicleTagState.equals(students.get(vehicleTagNumber).getVehicleTagState());
        }
        return false;
    }

    public static void removeStudent(int pos) {
        studentList.remove(pos);
    }

    public static ArrayList<Students_Information> getStudentList() {
        return studentList;
    }

    public String getStudentFName() {
        return studentFName;
    }

    public void setStudentFName(String studentFName) {
        this.studentFName = studentFName;
    }

    public String getStudentLName() {
        return studentLName;
    }

    public void setStudentLName(String studentLName) {
        this.studentLName = studentLName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getVehicleTagNumber() {
        return vehicleTagNumber;
    }

    public void setVehicleTagNumber(String vehicleTagNumber) {
        this.vehicleTagNumber = vehicleTagNumber;
    }

    public String getVehicleTagState() {
        return vehicleTagState;
    }

    public void setVehicleTagState(String vehicleTagState) {
        this.vehicleTagState = vehicleTagState;
    }

    public int getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(int vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
}
