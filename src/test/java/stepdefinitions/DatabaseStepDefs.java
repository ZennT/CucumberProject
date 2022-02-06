package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.sql.SQLException;

public class DatabaseStepDefs {

    @Given("user connects to the database")
    public void userConnectsToTheDatabase() {
        DBUtils.createConnection();  // static oldugu icin sinif ismiyle cagirabildik
    }

    // we reach the data here
    @And("user gets the {string} from {string} table")
    public void userGetsTheFromTable(String column, String table) {
//        DBUtils.getQueryResultList("select * from tp_customer");  // shorter way
//        Select * from tp_customer
        String myDynamicQuery = "Select " + column + " from " + table ;
        DBUtils.executeQuery(myDynamicQuery);
        System.out.println(myDynamicQuery);
    }

    // we will read the data here
    @And("user reads all of the {string} column data")
    public void userReadsAllOfTheColumnData(String column) throws SQLException {
        DBUtils.getResultset().next();  // next() --> takes us to the next row

//        I am on row 1
//        this gives me the single object on that row

        Object columnData = DBUtils.getResultset().getObject(column); // getobject() --> returns only one object
        System.out.println(columnData);

//        Going to the next row
        DBUtils.getResultset().next();
//        Getting the data on that row
        Object columnData2=DBUtils.getResultset().getObject(column);
        System.out.println(columnData2);

    }


}
