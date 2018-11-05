package uk.gov.hmcts.payment.api;

import com.microsoft.azure.serverless.functions.ExecutionContext;
import com.microsoft.azure.serverless.functions.annotation.BindingName;
import com.microsoft.azure.serverless.functions.annotation.FunctionName;
import com.microsoft.azure.serverless.functions.annotation.ServiceBusQueueTrigger;

public class ServiceCallbackFunction {

    @FunctionName("serviceCallback")
    public void serviceCallback(
            @ServiceBusQueueTrigger(connection = "ServiceCallbackBusConnection", queueName = "queue1", name = "serviceCallback") String req,
            @BindingName("service-callback-url") String serviceCallbackUrl,
            ExecutionContext context) {

        context.getLogger().warning(req);
        context.getLogger().warning(serviceCallbackUrl);
    }

}
