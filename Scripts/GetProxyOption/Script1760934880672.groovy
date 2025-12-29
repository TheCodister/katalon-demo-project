import com.google.gson.Gson 
import com.kms.katalon.core.configuration.RunConfiguration 
import com.kms.katalon.core.network.ProxyInformation 
import com.kms.katalon.core.network.ProxyOption

// Get current proxy information 
ProxyInformation proxy = RunConfiguration.getProxyInformation() 
println(proxy)  

// Switch proxy 
proxy.setProxyOption(ProxyOption.MANUAL_CONFIG.name()) 
proxy.setProxyServerAddress("127.0.0.1") 
proxy.setProxyServerPort(8082) 
Map<String, Object> generalProperties = RunConfiguration.getExecutionGeneralProperties();

generalProperties.put(RunConfiguration.PROXY_PROPERTY, 
new Gson().toJson(proxy)); 
println(proxy)


//switch back to no_proxy 
proxy.setProxyOption(ProxyOption.NO_PROXY.name()) 
proxy.setProxyServerAddress("") 
proxy.setProxyServerPort(0) 
Map<String, Object> generalProperty = RunConfiguration.getExecutionGeneralProperties();
generalProperty.put(RunConfiguration.PROXY_PROPERTY, new Gson().toJson(proxy));

println(proxy)