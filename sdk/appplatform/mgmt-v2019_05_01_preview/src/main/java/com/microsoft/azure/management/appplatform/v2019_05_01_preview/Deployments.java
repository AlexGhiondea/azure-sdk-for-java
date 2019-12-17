/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.implementation.DeploymentsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Deployments.
 */
public interface Deployments extends SupportsCreating<DeploymentResource.DefinitionStages.Blank>, HasInner<DeploymentsInner> {
    /**
     * List deployments for a certain service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentResource> listClusterAllDeploymentsAsync(final String resourceGroupName, final String serviceName);

    /**
     * Start the deployment.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param deploymentName The name of the Deployment resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable startAsync(String resourceGroupName, String serviceName, String appName, String deploymentName);

    /**
     * Stop the deployment.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param deploymentName The name of the Deployment resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable stopAsync(String resourceGroupName, String serviceName, String appName, String deploymentName);

    /**
     * Restart the deployment.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param deploymentName The name of the Deployment resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable restartAsync(String resourceGroupName, String serviceName, String appName, String deploymentName);

    /**
     * Get deployment log file URL.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param deploymentName The name of the Deployment resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LogFileUrlResponse> getLogFileUrlAsync(String resourceGroupName, String serviceName, String appName, String deploymentName);

    /**
     * Get a Deployment and its properties.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param deploymentName The name of the Deployment resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentResource> getAsync(String resourceGroupName, String serviceName, String appName, String deploymentName);

    /**
     * Handles requests to list all resources in an App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentResource> listAsync(final String resourceGroupName, final String serviceName, final String appName);

    /**
     * Operation to delete a Deployment.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param deploymentName The name of the Deployment resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serviceName, String appName, String deploymentName);

}