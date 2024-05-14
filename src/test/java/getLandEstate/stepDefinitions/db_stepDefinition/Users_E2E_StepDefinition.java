package getLandEstate.stepDefinitions.db_stepDefinition;

import getLandEstate.utilities.DB_Utilty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import static getLandEstate.utilities.DB_Utilty.*;
import static org.junit.Assert.assertEquals;


public class Users_E2E_StepDefinition {

    // ------------------------  E2E - Database Step Definition --------------------------------//

    String sqlQuery;
    ResultSet resultSet;
    List<String> columnNames;
    Map<String, Object> data;

    @When("Kayitli user sutun isimlerini almak icin query gonderilir")
    public void kayitliUserDatasiniAlmakIcinQueryGonderilir() {
        sqlQuery = "select * from users";
        columnNames = DB_Utilty.getColumnNames(sqlQuery);
    }

    @Then("Kayitli user sutun isimleri dogrulanir")
    public void kayitliUserDatasiDogrulanir() {
        assertEquals("id", columnNames.get(4));
        assertEquals("phone", columnNames.get(7));
        assertEquals("first_name", columnNames.get(8));
        assertEquals("last_name", columnNames.get(9));
        assertEquals("role", columnNames.get(10));
        assertEquals("email", columnNames.get(11));
    }

    @And("Kayitli user datalarini almak icin query gonderilir")
    public void kayitliUserDatalariniAlmakIcinQueryGonderilir() {
        sqlQuery = "select * from users where email = 'tester@gulsum.com'";
        resultSet = executeQuery(sqlQuery);
    }

    @Then("Kayitli user datalari dogrulanir")
    public void kayitliUserDatalariDogrulanir() {
        data = getRowMap("select * from users where email = 'tester@gulsum.com'");
        assertEquals(1406, ((Long) data.get("id")).intValue());
        assertEquals("(555) 777-9999", data.get("phone"));
        assertEquals("tester", data.get("first_name"));
        assertEquals("gulsum", data.get("last_name"));
        assertEquals("CUSTOMER", data.get("role"));
        assertEquals("tester@gulsum.com", data.get("email"));
    }


    @When("Kayitli user role bilgisini almak icin query gonderilir")
    public void kayitliUserRoleBilgisiniAlmakIcinQueryGonderilir() {
        sqlQuery = "select role from users where email = 'tester@gulsum.com'";
        resultSet = executeQuery(sqlQuery);
    }

    @Then("Kayitli user role bilgisi dogrulanir")
    public void kayitliUserRoleBilgisiDogrulanir() {
        data = getRowMap("select role from users where email = 'tester@gulsum.com'");
        System.out.println(data);
        assertEquals("ADMIN", data.get("role"));
    }

    @When("Kayitli user bilgisini almak icin query gonderilir")
    public void kayitliUserBilgisiniAlmakIcinQueryGonderilir() {
        sqlQuery = "select role from users where email = 'tester@gulsum.com';";
        resultSet = executeQuery(sqlQuery);
    }

    @Then("Kayitli user silindigi dogrulanir")
    public void kayitliUserSilindigiDogrulanir() {
        try (Connection connection = DB_Utilty.createStatement().getConnection()) {
            String selectQuery = "SELECT id FROM users WHERE id = 1406";
            try (PreparedStatement selectStatement = connection.prepareStatement(selectQuery)) {
                selectStatement.setInt(1, 1406);
                try (ResultSet resultSet = selectStatement.executeQuery()) {
                    if (!resultSet.next()) {
                        System.out.println("Kullanıcı başarıyla silinmiş.");
                    } else {
                        System.out.println("Hata: Kullanıcı hala veritabanında bulunuyor.");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
