# Traffic mirror方案

## 主要教程参考这个

完整的实现逻辑请参考： https://aws.amazon.com/cn/blogs/networking-and-content-delivery/mirror-production-traffic-to-test-environment-with-vpc-traffic-mirroring/

关键回放的Go代码： https://github.com/aws-samples/http-requests-mirroring/blob/main/main.go

## 收费逻辑
参考以下链接的 Network Analysis部分
https://aws.amazon.com/cn/vpc/pricing/?nc1=h_ls
-- 一张网卡一小时收费多少
Hourly Price per ENI:	$0.015

## 过滤支持
不支持域名， 支持的4层网络协议的：

```bash
Traffic direction: Inbound or outbound
Action: The action to take, either to accept or reject the packet
Protocol: The L4 protocol
Source port range
Destination port range
Source CIDR block
Destination CIDR block
```

具体可以参考：
https://docs.amazonaws.cn/en_us/vpc/latest/mirroring/traffic-mirroring-filter.html