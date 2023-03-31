# Monitor a Spring Boot App With Prometheus and Grafana

A step-by-step guide on how to set up monitoring for a Spring Boot app

Monitoring microservices is a challenging task. It’s a crucial step toward having a stable production system. By observing various metrics, we understand how the system behaves under different load conditions and which metrics need more attention.

In this tutorial, I’ll show you how to set up Prometheus and Grafana to monitor a Spring Boot application.

You’ll learn how to:

- Configure Spring Boot Actuator to enable metrics
- Configure Prometheus to scrape the metrics
- Use PromQL to query various metrics in the Prometheus UI
- Visualize the metrics in a Grafana Dashboard

This repo assumes you have basic Spring Boot knowledge. We’ll concentrate on the monitoring configuration part.

Let’s get started!

## Understand the Components
- The Spring Boot app has an Actuator module that allows us to monitor and manage our app. It integrates flawlessly with third-party monitoring tools, such as Prometheus.
- Micrometer collects the metrics from our app and exposes them to external systems, in this case, Prometheus.
- Grafana is a visual tool that shows the metrics from a data source (e.g. Prometheus) in a Dashboard.

## Dependencies

```bash
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
<dependency>
   <groupId>io.micrometer</groupId>
   <artifactId>micrometer-registry-prometheus</artifactId>
   <scope>runtime</scope>
</dependency>
```

## Configure Spring Boot Actuator
First configure the application.yml file to enable monitoring as shown in the project

Note that we enabled the health, metrics, and Prometheus paths.

Start the app and open at
```bash
http://localhost:8080/actuator
```

Similarly,
- For Health
```bash
http://localhost:8080/actuator/health
 ```
- For Metrics
```bash
http://localhost:8080/actuator/metrics
 ```
- For Prometheus
```bash
http://localhost:8080/actuator/prometheus
 ```

## Conclusion

Now you know how to scrape and visualize various metrics from a Spring Boot app using Actuator, Prometheus, and Grafana.

The setup was elementary, without any customization and authentication. There is still much more that you could do to monitor your app. For example, you can create your custom endpoints and metrics. Only authorized users may access specific information.

## 🚀 About Me
I'm a Software Developer Engineer in Siemens, Bengaluru...

## Authors
- [Parvez @ linked](https://www.linkedin.com/in/imparvez/)
- [Parvez @ Twitter](https://twitter.com/Parvez__AI)
- [Parvez @ Github](https://github.com/Parvezi123)