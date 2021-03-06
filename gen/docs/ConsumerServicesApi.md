# ConsumerServicesApi

All URIs are relative to *https://us-ev-api.experian.com/consumerservices/verification/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCpdIncomeAndEmploymentData**](ConsumerServicesApi.md#getCpdIncomeAndEmploymentData) | **POST** /experianverify | Experian Verify income and employment report


<a name="getCpdIncomeAndEmploymentData"></a>
# **getCpdIncomeAndEmploymentData**
> VoieResponse getCpdIncomeAndEmploymentData(clientReferenceId, contentType, accept, subcode, body)

Experian Verify income and employment report

Returns income and employment data for a given consumer from employee payroll provider.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConsumerServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://us-ev-api.experian.com/consumerservices/verification/v1");
    
    // Configure OAuth2 access token for authorization: OauthSecurity
    OAuth OauthSecurity = (OAuth) defaultClient.getAuthentication("OauthSecurity");
    OauthSecurity.setAccessToken("YOUR ACCESS TOKEN");

    ConsumerServicesApi apiInstance = new ConsumerServicesApi(defaultClient);
    String clientReferenceId = "clientReferenceId_example"; // String | API client generated reference Id to uniquely identify the  transaction.
    String contentType = "application/json"; // String | Input Request format
    String accept = "application/json"; // String | Output Response format
    String subcode = "subcode_example"; // String | unique value provided by experian at onboarding
    VoieRequestParams body = new VoieRequestParams(); // VoieRequestParams | Consumer's PII , Requestor Information, Addons and any custom options to be specified here.
    try {
      VoieResponse result = apiInstance.getCpdIncomeAndEmploymentData(clientReferenceId, contentType, accept, subcode, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumerServicesApi#getCpdIncomeAndEmploymentData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientReferenceId** | **String**| API client generated reference Id to uniquely identify the  transaction. |
 **contentType** | **String**| Input Request format | [default to application/json] [enum: application/json]
 **accept** | **String**| Output Response format | [default to application/json] [enum: application/json]
 **subcode** | **String**| unique value provided by experian at onboarding |
 **body** | [**VoieRequestParams**](VoieRequestParams.md)| Consumer&#39;s PII , Requestor Information, Addons and any custom options to be specified here. |

### Return type

[**VoieResponse**](VoieResponse.md)

### Authorization

[OauthSecurity](../README.md#OauthSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | API responds with a JSON. |  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  |
**400** | Bad Request |  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  |
**401** | Unauthorized |  -  |
**403** | Forbidden. |  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  |
**404** | Not Found. |  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  |
**405** | Method not Allowed |  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  |
**406** | Not Acceptable |  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  |
**415** | Unsupported Media Type |  * experianTransactionId - Unique ID generated by Experian for this API request <br>  * clientReferenceId - Echo back of the reference Id , if provided on API request header <br>  |
**429** | Too many requests |  -  |
**500** | Internal Server Error. |  -  |
**502** | bad gateway. |  -  |
**503** | Service Unavailable. |  -  |
**504** | Gateway Timeout. |  -  |

