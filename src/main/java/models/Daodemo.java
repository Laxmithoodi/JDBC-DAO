package models;

import daos.CarDAO;
import utils.DBType;
import utils.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Daodemo {
    public static void main(String... args) {
        try (Connection conn = DBUtil.getConnection(DBType.MYSQLDB);) {
            CarDAO carDAO = new CarDAO(conn);


            // CREATE

            Car carCreate = new Car();
            //carCreate.setId(108);
            carCreate.setMake("Hyundai");
            carCreate.setModel("Sonata");
            carCreate.setYear(2003);
            carCreate.setColor("Purple");
            carCreate.setVin(54897235);

            carDAO.create(carCreate);
          System.out.println(carCreate);
            //System.out.println(carCreate);

            //READ
            /*
            Car carRead = carDAO.findById(104);
            System.out.println(carRead);
            */

            //READALL


          //  System.out.println(carDAO.findAll().toString());


            //UPDATE
            /*
            Car carUpdate = carDAO.findById(106);
            System.out.println(carUpdate);
            carUpdate.setColor("Orange");
            System.out.println(carUpdate);
            */

            //DELETE
           // carDAO.delete(109);


        } catch (SQLException e) {
            DBUtil.showErrorMessage(e);

        }


    }
}
