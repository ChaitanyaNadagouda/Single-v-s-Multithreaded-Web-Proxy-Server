 Multithreaded Web Proxy Server Performance Comparison

Welcome to the Multithreaded Web Proxy Server Performance Comparison project! This repository contains code for comparing the performance of single-threaded and multithreaded web servers implemented using the executor service. Through this project, you'll gain insights into how concurrency affects the performance of web servers and understand the trade-offs between different server architectures.

Overview
In this project, we implement both single-threaded and multithreaded web proxy servers and compare their performances under various load conditions. We utilize Apache JMeter to simulate different levels of traffic by sending requests to the specific ports served by these servers. By analyzing the results using JMeter's Thread Group, Results Tree, Graphs, and Tables, we can evaluate factors such as response time, throughput, and concurrency.

How to Run
To run this project on your system, follow these steps:

1)Clone the repository to your local machine:
git clone https://github.com/yourusername/multithreaded-web-proxy.git

2)Navigate to the project directory:
cd multithreaded-web-proxy

3)Build the project/Compile it:
javac *.java

4)Run the servers:
  To start the single-threaded server:
  java SingleThreadedServer

  To start the multithreaded server:
  java MultiThreadedServer

5)Set up Apache JMeter:

   1)Download and install Apache JMeter from here.

   2)Open JMeter and create a new Test Plan.

   3)Add a Thread Group to the Test Plan to simulate concurrent users.

   4)Configure HTTP Request Defaults with the server's hostname and port.

   5)Add HTTP Request Sampler to send requests to the server.

   6)Add listeners like Results Tree, Graphs, and Tables to analyze the results.

   7)Run the test in JMeter and observe the performance metrics.

What You'll Learn
By exploring this project, you'll learn:

The impact of concurrency on the performance of web servers.
How different server architectures handle varying levels of load.
Techniques for measuring server performance using Apache JMeter.
Strategies for optimizing server concurrency and throughput.
Further Exploration.

While this project provides a fundamental comparison between single-threaded and multithreaded web servers, there are still many avenues for further exploration, including:

Experimenting with different thread pool configurations to optimize performance.
Exploring other concurrency models such as asynchronous I/O.
Scaling the servers horizontally to handle distributed loads.
Investigating the performance of web servers under different network conditions.
Feel free to fork this repository, experiment with different configurations, and contribute your findings back to the community!

Happy coding! 🚀
