package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marne on 7/24/2016.
 */

/****************************************************************************************
 * This is a model class of entity type Employee
 * When an object of this  class is created we can access or update the attributes of Employee relation in database using the Ebean
 */
@Entity
@Table(name="Employee")
public class Employee extends Model{

    @Id
    @Column(name="Eid")
    private int _eid;
    public void setEid(int eid){this._eid = eid;}
    public int getEid(){return this._eid;}

    @Column(name="EName")
    private String _ename;
    public void setEname(String ename){this._ename = ename;}
    public String getEname(){return this._ename;}

    @Column(name="OPhoneNumber")
    private long _phNumber;
    public void setPNumber(long pNumber){this._phNumber = pNumber;}
    public long getPNumber(){return this._phNumber;}

    @Column(name="ManagerId")
    private Integer _mgrId;
    public void setMgrId(Integer mgrId){this._mgrId = mgrId;}
    public Integer getMgrId(){return this._mgrId;}




    public Employee(){
        this._eid = -1;
        this._ename = null;
        this._phNumber = -1;
        this._mgrId = -1;
    }


    public Employee(int eid, String ename, long oPNumber, int mgrId){
        this._eid = eid;
        this._ename = ename;
        this._phNumber = oPNumber;
        this._mgrId = mgrId;
    }
    /************************************************************************************
     * getAllEmpIds() is  a Model class method that gets the list of all Employee id's
     * @param none
     * @return emps
     */
    public List<Employee> getAllEmpIds()throws SQLException, ClassNotFoundException,IllegalAccessException,InstantiationException{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB05_Test","root","Mdsp1891#");
        Statement stmt = conn.createStatement();

        String getAllEmployees = "Select * from Employee;";
        ResultSet rs = stmt.executeQuery(getAllEmployees);
        List<Employee> emps = new ArrayList<Employee>();
        Employee emp;
        while(rs.next()) {
            emp = new Employee();
            emp.setEid(rs.getInt("Eid"));
            emp.setEname(rs.getString("EName"));
            emp.setPNumber(rs.getLong("OPhoneNumber"));
            emp.setMgrId(rs.getInt("ManagerId"));

            emps.add(emp);


        }
        return emps;

    }


    public static Finder<Integer,Employee> find = new Finder<Integer,Employee> (Integer.class, Employee.class);




}
