import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        try {
            String apiUrl = "https://api.example.com/data"; // Replace with your API URL
            String jsonResponse = APIUtility.callAPI(apiUrl);

            Gson gson = new Gson();
            ApiResponse apiResponse = gson.fromJson(jsonResponse, ApiResponse.class);

            System.out.println("Received message from API: " + apiResponse.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
