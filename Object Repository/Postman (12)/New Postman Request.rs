<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>New Postman Request</name>
   <tag></tag>
   <elementGuidId>63d1e082-01c3-4b22-9fde-ef65aad15347</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;name\&quot;: \&quot;token-manager\&quot;,\n    \&quot;command\&quot;: \&quot;-retry\u003d0 -testSuitePath\u003d\\\&quot;Test Suites/Test Suite SIT\\\&quot; -browserType\u003d\\\&quot;Chrome (headless)\\\&quot; -executionProfile\u003d\\\&quot;default-gcp\\\&quot; -orgID\u003d1541978 -testOpsProjectId\u003d1629013 -testSuiteQuery\u003d\\\&quot;tags\u003d(token-manager,sit)\\\&quot; -g_tags\u003d\\\&quot;token-manager,sit\\\&quot; -g_uuid_run\u003d\\\&quot;b19b8d64-099a-4ada-873f-8fad5eae96af\\\&quot; --config -proxy.auth.option\u003dNO_PROXY -proxy.system.option\u003dNO_PROXY -proxy.system.applyToDesiredCapabilities\u003dtrue -webui.autoUpdateDrivers\u003dfalse\&quot;,\n    \&quot;teamId\&quot;: \&quot;1610058\&quot;,\n    \&quot;projectId\&quot;: \&quot;1629013\&quot;,\n    \&quot;testProjectId\&quot;: 1656271,\n    \&quot;id\&quot;: \&quot;1013726\&quot;,\n    \&quot;agents\&quot;: [\n        {\n            \&quot;id\&quot;: 432147,\n            \&quot;name\&quot;: \&quot;IT Agent 2 SIT\&quot;,\n            \&quot;ip\&quot;: \&quot;10.43.206.213\&quot;,\n            \&quot;uuid\&quot;: \&quot;1755672756539-c815fb68-d640-4c4b-a423-6d4fb960aafd\&quot;,\n            \&quot;lastPing\&quot;: \&quot;2025-12-02T06:24:20.851+0000\&quot;,\n            \&quot;os\&quot;: \&quot;Linux\&quot;,\n            \&quot;organizationId\&quot;: 1541978,\n            \&quot;accountUuid\&quot;: \&quot;ad6c7495-0e4f-4082-a64c-ec6da3b784b4\&quot;,\n            \&quot;hostname\&quot;: \&quot;ip-10-43-206-213.ap-southeast-1.compute.internal\&quot;,\n            \&quot;active\&quot;: true,\n            \&quot;threshold\&quot;: 3,\n            \&quot;numExecutingJobs\&quot;: 0,\n            \&quot;numAssignedJobs\&quot;: 1,\n            \&quot;agentVersion\&quot;: \&quot;v2.5.1\&quot;,\n            \&quot;deleted\&quot;: false,\n            \&quot;browserType\&quot;: \&quot;CHROME\&quot;,\n            \&quot;cloudType\&quot;: \&quot;LOCAL_AGENT\&quot;,\n            \&quot;enabledTestCloudTunnel\&quot;: false,\n            \&quot;metadata\&quot;: {}\n        },\n        {\n            \&quot;id\&quot;: 432146,\n            \&quot;name\&quot;: \&quot;IT Agent 1 SIT\&quot;,\n            \&quot;ip\&quot;: \&quot;10.43.206.213\&quot;,\n            \&quot;uuid\&quot;: \&quot;1755672662793-57918408-3eeb-488f-a933-37f504f6215a\&quot;,\n            \&quot;lastPing\&quot;: \&quot;2025-12-02T06:24:18.641+0000\&quot;,\n            \&quot;os\&quot;: \&quot;Linux\&quot;,\n            \&quot;organizationId\&quot;: 1541978,\n            \&quot;accountUuid\&quot;: \&quot;ad6c7495-0e4f-4082-a64c-ec6da3b784b4\&quot;,\n            \&quot;hostname\&quot;: \&quot;ip-10-43-206-213.ap-southeast-1.compute.internal\&quot;,\n            \&quot;active\&quot;: true,\n            \&quot;threshold\&quot;: 3,\n            \&quot;numExecutingJobs\&quot;: 1,\n            \&quot;numAssignedJobs\&quot;: 1,\n            \&quot;agentVersion\&quot;: \&quot;v2.5.1\&quot;,\n            \&quot;deleted\&quot;: false,\n            \&quot;browserType\&quot;: \&quot;CHROME\&quot;,\n            \&quot;cloudType\&quot;: \&quot;LOCAL_AGENT\&quot;,\n            \&quot;enabledTestCloudTunnel\&quot;: false,\n            \&quot;metadata\&quot;: {}\n        }\n    ],\n    \&quot;k8sAgents\&quot;: [],\n    \&quot;circleCIAgents\&quot;: [],\n    \&quot;cloudType\&quot;: \&quot;LOCAL_AGENT\&quot;,\n    \&quot;browserType\&quot;: \&quot;CHROME\&quot;,\n    \&quot;configType\&quot;: \&quot;COMMAND\&quot;,\n    \&quot;testSuiteId\&quot;: 29811101,\n    \&quot;ksVersion\&quot;: \&quot;10.3.2\&quot;,\n    \&quot;timeOut\&quot;: 180,\n    \&quot;executionMode\&quot;: \&quot;PARALLEL\&quot;,\n    \&quot;enabledKobitonIntegration\&quot;: false,\n    \&quot;enabledTestCloudTunnel\&quot;: false,\n    \&quot;baselineCollectionGroupOrder\&quot;: null,\n    \&quot;testSuiteCollections\&quot;: [],\n    \&quot;testCloudTestSuiteCollectionAgents\&quot;: [],\n    \&quot;testSuitesRunConfig\&quot;: [],\n    \&quot;xrayImportReportType\&quot;: \&quot;PUSH_MANUALLY\&quot;,\n    \&quot;customFieldOptions\&quot;: [],\n    \&quot;tags\&quot;: [],\n    \&quot;testRunConfig\&quot;: {\n        \&quot;executionType\&quot;: \&quot;G4\&quot;,\n        \&quot;executionMetadata\&quot;: {\n            \&quot;agentType\&quot;: \&quot;LOCAL\&quot;,\n            \&quot;engine\&quot;: {\n                \&quot;type\&quot;: \&quot;G4\&quot;,\n                \&quot;version\&quot;: \&quot;10.3.2\&quot;\n            },\n            \&quot;config\&quot;: {\n                \&quot;testSuiteId\&quot;: 29811101,\n                \&quot;executionEnvs\&quot;: [\n                    {\n                        \&quot;platform\&quot;: \&quot;Linux\&quot;,\n                        \&quot;framework\&quot;: \&quot;SELENIUM\&quot;,\n                        \&quot;localAgentId\&quot;: 432147\n                    },\n                    {\n                        \&quot;platform\&quot;: \&quot;Linux\&quot;,\n                        \&quot;framework\&quot;: \&quot;SELENIUM\&quot;,\n                        \&quot;localAgentId\&quot;: 432146\n                    }\n                ]\n            }\n        },\n        \&quot;settings\&quot;: {\n            \&quot;executionMode\&quot;: \&quot;PARALLEL\&quot;,\n            \&quot;enabledKobitonIntegration\&quot;: false,\n            \&quot;enabledTestCloudTunnel\&quot;: false\n        },\n        \&quot;scheduler\&quot;: {\n            \&quot;name\&quot;: \&quot;\&quot;,\n            \&quot;startTime\&quot;: \&quot;2025-12-02T06:24:52.543Z\&quot;,\n            \&quot;endTime\&quot;: null,\n            \&quot;interval\&quot;: 1,\n            \&quot;intervalUnit\&quot;: \&quot;WEEK\&quot;,\n            \&quot;active\&quot;: false,\n            \&quot;repeatEnable\&quot;: false\n        }\n    },\n    \&quot;source\&quot;: \&quot;USER\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>d111fd8c-64fa-4f31-81c1-f5a013dc0cdd</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>10.4.2</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${baseURL}/api/v1/smart-scheduler/save-configuration?verifyRunConfiguration=true</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.baseURL</defaultValue>
      <description></description>
      <id>61261434-07f7-4998-bcc7-483ab811f121</id>
      <masked>false</masked>
      <name>baseURL</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
