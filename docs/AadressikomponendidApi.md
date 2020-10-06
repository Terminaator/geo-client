# AadressikomponendidApi

All URIs are relative to *https://devkluster.ehr.ee/api/geoinfo/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addresscomponentchildrenGet**](AadressikomponendidApi.md#addresscomponentchildrenGet) | **GET** /addresscomponentchildren | Aadressi komponendi alamkomponentide otsimine.

<a name="addresscomponentchildrenGet"></a>
# **addresscomponentchildrenGet**
> AddressComponent addresscomponentchildrenGet(id)

Aadressi komponendi alamkomponentide otsimine.

Tagastab JSON formaadis aadressi komponendi alamkomponendid. Ülemise taseme komponendid saab ilma komponendi koodita.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AadressikomponendidApi;


AadressikomponendidApi apiInstance = new AadressikomponendidApi();
BigDecimal id = new BigDecimal(); // BigDecimal | Komponendi id, mille alusel leitakse alamad. Juhul, kui id puudub siis tagastatakse kõik ülemise taseme komponendid.
try {
    AddressComponent result = apiInstance.addresscomponentchildrenGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AadressikomponendidApi#addresscomponentchildrenGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **BigDecimal**| Komponendi id, mille alusel leitakse alamad. Juhul, kui id puudub siis tagastatakse kõik ülemise taseme komponendid. | [optional]

### Return type

[**AddressComponent**](AddressComponent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

