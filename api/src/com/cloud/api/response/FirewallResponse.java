// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package com.cloud.api.response;

import com.cloud.api.ApiConstants;
import com.cloud.serializer.Param;
import com.cloud.utils.IdentityProxy;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class FirewallResponse extends BaseResponse {
    @SerializedName(ApiConstants.ID) @Param(description="the ID of the firewall rule")
    private IdentityProxy id = new IdentityProxy("firewall_rules");

    @SerializedName(ApiConstants.PROTOCOL) @Param(description="the protocol of the firewall rule")
    private String protocol;

    @SerializedName(ApiConstants.START_PORT) @Param(description="the starting port of firewall rule's port range")
    private String startPort;

    @SerializedName(ApiConstants.END_PORT)  @Param(description = "the ending port of firewall rule's port range")
    private String endPort;
    
    @SerializedName(ApiConstants.IP_ADDRESS_ID) @Param(description="the public ip address id for the firewall rule")
    private Long publicIpAddressId;

    @SerializedName(ApiConstants.IP_ADDRESS) @Param(description="the public ip address for the firewall rule")
    private String publicIpAddress;
    
    @SerializedName(ApiConstants.STATE) @Param(description="the state of the rule")
    private String state;

    @SerializedName(ApiConstants.CIDR_LIST) @Param(description="the cidr list to forward traffic from")
    private String cidrList;
    
    @SerializedName(ApiConstants.ICMP_TYPE) @Param(description= "type of the icmp message being sent")
    private Integer icmpType;

    @SerializedName(ApiConstants.ICMP_CODE) @Param(description = "error code for this icmp message")
    private Integer icmpCode;

    public void setId(Long id) {
        this.id.setValue(id);
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setStartPort(String startPort) {
        this.startPort = startPort;
    }

    public void setEndPort(String endPort) {
        this.endPort = endPort;
    }

    public void setPublicIpAddressId(Long publicIpAddressId) {
        this.publicIpAddressId = publicIpAddressId;
    }

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCidrList(String cidrList) {
        this.cidrList = cidrList;
    }

    public void setIcmpType(Integer icmpType) {
        this.icmpType = icmpType;
    }

    public void setIcmpCode(Integer icmpCode) {
        this.icmpCode = icmpCode;
    }
}
