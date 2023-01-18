package constructor
import com.kms.katalon.core.testobject.ResponseObject

public class Data {
	private ResponseObject response
	private String token

	public ResponseObject getResponse() {
		return response
	}
	public void setResponse(ResponseObject response) {
		this.response = response
	}

	public String getToken() {
		return token
	}
	public void setToken(String token) {
		this.token = token
	}
}