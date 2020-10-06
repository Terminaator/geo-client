# AadressobjektidApi

All URIs are relative to *https://devkluster.ehr.ee/api/geoinfo/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addorupdateaddressPost**](AadressobjektidApi.md#addorupdateaddressPost) | **POST** /addorupdateaddress | Aadressi uuendamine või lisamine.
[**getgeoobjectsbyaddressGet**](AadressobjektidApi.md#getgeoobjectsbyaddressGet) | **GET** /getgeoobjectsbyaddress | Aadressi alusel objektide otsimine. Objektideks on ehitise ruumikujud ehk kui ehitisel on mitu ruumikuju siis tagastatakse ühe EHR koodiga mitu objekti.
[**getgeoobjectsbypointGet**](AadressobjektidApi.md#getgeoobjectsbypointGet) | **GET** /getgeoobjectsbypoint | Punkti alusel objektide otsimine

<a name="addorupdateaddressPost"></a>
# **addorupdateaddressPost**
> AddressResponseDTO addorupdateaddressPost(body)

Aadressi uuendamine või lisamine.

Võtab JSON kujul aadressi sisendiks. Address koosneb komponentitest. Vaata lähemalt näidet. Tagastab JSON kujul aadress.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AadressobjektidApi;


AadressobjektidApi apiInstance = new AadressobjektidApi();
AddressRequestDTO body = new AddressRequestDTO(); // AddressRequestDTO | 
try {
    AddressResponseDTO result = apiInstance.addorupdateaddressPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AadressobjektidApi#addorupdateaddressPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddressRequestDTO**](AddressRequestDTO.md)|  | [optional]

### Return type

[**AddressResponseDTO**](AddressResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getgeoobjectsbyaddressGet"></a>
# **getgeoobjectsbyaddressGet**
> FeatureList getgeoobjectsbyaddressGet(address, epsg, rgo)

Aadressi alusel objektide otsimine. Objektideks on ehitise ruumikujud ehk kui ehitisel on mitu ruumikuju siis tagastatakse ühe EHR koodiga mitu objekti.

Tagastab GeoJson formaadis kuni 100 aadressiobjekti, mille aadressid sisaldavad query stringi või ehitise ruumikujud, kui sisend on EHR kood.\\n Koordinaadid XY on kas Lest või WGS84 formaadis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AadressobjektidApi;


AadressobjektidApi apiInstance = new AadressobjektidApi();
String address = "address_example"; // String | Aadressi string mille alusel otsitakse või EHR kood (11 arvsümbolit)
String epsg = "epsg_example"; // String | Kui = \"wgs84\" siis tagastab koordinaadid WGS84 formaadis
String rgo = "rgo_example"; // String | Kui true siis tagastab objektid, millel on ruumikuju olemas, kui false siis tagastab ka ruumikujuta objektid.
try {
    FeatureList result = apiInstance.getgeoobjectsbyaddressGet(address, epsg, rgo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AadressobjektidApi#getgeoobjectsbyaddressGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Aadressi string mille alusel otsitakse või EHR kood (11 arvsümbolit) |
 **epsg** | **String**| Kui &#x3D; \&quot;wgs84\&quot; siis tagastab koordinaadid WGS84 formaadis | [optional] [enum: wgs84]
 **rgo** | **String**| Kui true siis tagastab objektid, millel on ruumikuju olemas, kui false siis tagastab ka ruumikujuta objektid. | [optional] [enum: true, false]

### Return type

[**FeatureList**](FeatureList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getgeoobjectsbypointGet"></a>
# **getgeoobjectsbypointGet**
> FeatureList getgeoobjectsbypointGet(lon, lat)

Punkti alusel objektide otsimine

Tagastab GeoJson formaadis kuni 100 aadressiobjekti, mis sisaldavad ette antud punkti. Koordinaadid XY. Sisend Lest97 &#x3D;&gt; Väljund Lest97 või sisend WGS84 &#x3D;&gt; Väljund WGS84

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AadressobjektidApi;


AadressobjektidApi apiInstance = new AadressobjektidApi();
String lon = "lon_example"; // String | Longitude ehk X kas WGS või LEST
String lat = "lat_example"; // String | Latitude ehk Y kas WGS või LEST
try {
    FeatureList result = apiInstance.getgeoobjectsbypointGet(lon, lat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AadressobjektidApi#getgeoobjectsbypointGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lon** | **String**| Longitude ehk X kas WGS või LEST |
 **lat** | **String**| Latitude ehk Y kas WGS või LEST |

### Return type

[**FeatureList**](FeatureList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

