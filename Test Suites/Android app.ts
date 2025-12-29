<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>Android app</name>
   <tag></tag>
   <delayBetweenInstances>0</delayBetweenInstances>
   <executionMode>SEQUENTIAL</executionMode>
   <maxConcurrentInstances>8</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>true</requireConfigurationData>
            <runConfigurationData>
               <entry>
                  <key>testCloudMobileDevice</key>
                  <value>{
  &quot;capability&quot;: {
    &quot;availability&quot;: &quot;HIGH&quot;
  },
  &quot;id&quot;: &quot;any_android_phone&quot;,
  &quot;isTablet&quot;: false,
  &quot;mobileDeviceId&quot;: &quot;any_android_phone_15&quot;,
  &quot;name&quot;: &quot;Any Phone&quot;,
  &quot;displayName&quot;: &quot;Any Phone&quot;,
  &quot;osVersion&quot;: &quot;15&quot;,
  &quot;os&quot;: &quot;Android&quot;,
  &quot;platformName&quot;: &quot;ANDROID&quot;,
  &quot;timeout&quot;: 15,
  &quot;usingTunnel&quot;: false,
  &quot;isHighAvailableDevice&quot;: true
}</value>
               </entry>
               <entry>
                  <key>testCloudSessionType</key>
                  <value>MOBILE_NATIVE</value>
               </entry>
               <entry>
                  <key>testCloudOverrideMobileApplication</key>
                  <value>{&quot;id&quot;:&quot;e98c8642-4dd1-4603-af3f-58cf870c7e48&quot;,&quot;organizationId&quot;:&quot;2329926&quot;,&quot;name&quot;:&quot;ios_flutter_app&quot;,&quot;platform&quot;:&quot;ANDROID&quot;,&quot;status&quot;:&quot;READY&quot;,&quot;size&quot;:21341013,&quot;storagePath&quot;:&quot;6a0286a7-3083-42bd-bddc-4494b08fbccb&quot;,&quot;uploadedDate&quot;:&quot;2025-06-24T07:21:28.167331&quot;,&quot;createdDate&quot;:&quot;2025-06-24T07:21:28.167331&quot;,&quot;updatedDate&quot;:&quot;2025-06-24T07:21:32.091731&quot;,&quot;fileName&quot;:&quot;URL Launcher.apk&quot;,&quot;metadata&quot;:{&quot;identifier&quot;:&quot;com.example.ios_flutter_app&quot;,&quot;name&quot;:&quot;ios_flutter_app&quot;,&quot;version&quot;:&quot;1.0.0&quot;}}</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>TestCloud</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Android Test Suite</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
