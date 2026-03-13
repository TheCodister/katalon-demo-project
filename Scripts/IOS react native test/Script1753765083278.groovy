import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

// Create request object
RequestObject ro = new RequestObject("petStoreRequest")
ro.setRestUrl("https://petstore.swagger.io/v2/pet/1")
ro.setRestRequestMethod("POST")

// Set headers
TestObjectProperty contentTypeHeader = new TestObjectProperty("Content-Type", ConditionType.EQUALS, "application/json")
ro.setHttpHeaderProperties(Arrays.asList(contentTypeHeader))

// Set body
String requestBody = '{"id":0,"category":{"id":0,"name":"string"},"name":"doggie","photoUrls":["string"],"tags":[{"id":0,"name":"string"}],"status":"available"}'
ro.setBodyContent(new HttpTextBodyContent(requestBody))

// Send request
ResponseObject response = WS.sendRequest(ro)

// Handle response
println("Status: " + response.getStatusCode())
println("Response: " + response.getResponseBodyContent())