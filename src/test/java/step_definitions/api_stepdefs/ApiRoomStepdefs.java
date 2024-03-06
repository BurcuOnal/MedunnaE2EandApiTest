package step_definitions.api_stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.RoomPojo;

import java.util.List;
import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static step_definitions.e2e_stepdefs.MedunnaRoomStepDefs.roomNumber;
import static utilities.MedunnaBaseUrl.spec;

public class ApiRoomStepdefs {
    int roomId;

    @Given("Get room ID")
    public void getRoomID() {
        spec.pathParams("first","api","second","rooms")
                .queryParam("sort","createdDate,desc");
        Response response = given(spec).when().get("{first}/{second}");
        List<Integer> roomIdList = response.jsonPath().getList("findAll{it.roomNumber=="+roomNumber+"}.id");
        roomId = roomIdList.get(0);
        System.out.println("roomIdList = " + roomIdList);

    }
    public static RoomPojo expectedData;
    Response response;
    @When("Send get request")
    public void sendGetRequest() {
        spec.pathParams("first","api","second","rooms","third",roomId);

        expectedData = new RoomPojo(roomNumber,"SUITE",true,123.00,"Created for MedunnaAutomationE2EandApi Test");

        response = given(spec).when().get("{first}/{second}/{third}");
    }

    @Then("Assert the response")
    public void assertTheResponse() {
        RoomPojo actualData = response.as(RoomPojo.class);

        assertEquals(200,response.statusCode());
        assertEquals(expectedData.getRoomNumber(),actualData.getRoomNumber());
        assertEquals(expectedData.isStatus(),actualData.isStatus());
        assertEquals(expectedData.getPrice(),actualData.getPrice());
        assertEquals(expectedData.getDescription(),actualData.getDescription());
    }


}
