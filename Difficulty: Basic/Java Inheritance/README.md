<h2><a href="https://www.geeksforgeeks.org/problems/java-inheritance/1?page=2&category=Java&sortBy=submissions">Java Inheritance</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Inheritance is an important pillar of OOP(Object Oriented Programming). It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.</span></p>

<p><span style="font-size:18px">Consider the following class <strong>cls1</strong>:</span><br>
<span style="font-size:18px">class cls1<br>
{</span><br>
<span style="font-size:18px">&nbsp;&nbsp;&nbsp; void add(int p,int q){<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; System.out.println(p+q);<br>
&nbsp;&nbsp;&nbsp; }<br>
}</span></p>

<p><span style="font-size:18px">There is another class <strong>cls2</strong> which extends class cls1:<br>
class cls2 extends cls1<br>
{<br>
&nbsp;&nbsp;&nbsp; void mul(int p,int q)<br>
&nbsp;&nbsp;&nbsp; {<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; System.out.println(p*q);<br>
&nbsp;&nbsp;&nbsp; }<br>
}</span></p>

<p><span style="font-size:18px">So we can make object of a class cls2, which can use both <strong>mul</strong> and <strong>add</strong> methods. Main function is already created in the editor and instance of cls2 is also made.</span><span style="font-size:18px"> So the task is to add a method in class cls2 naming <strong>task()</strong> which will take 2 parameters as input i.e. <strong>a</strong> and <strong>b</strong> and print the sum of their squares i.e a<sup>2</sup>+b<sup>2</sup>. Changes in the main function has been made already.</span></p>

<p><span style="font-size:18px"><strong>Input:</strong><br>
The input line contains <strong>T</strong>, denotes the number of testcase. Each testcase contains one line containing <strong>a</strong> and <strong>b</strong> separated by space.</span></p>

<p><span style="font-size:18px"><strong>Output:</strong><br>
For each testcase in new line, print the required answer.</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= T &lt;= 100<br>
1 &lt;= a, b &lt;= 10<sup>3</sup></span></p>

<p><span style="font-size:18px"><strong>Example:<br>
Input:</strong></span><br>
<span style="font-size:18px">1<br>
2 4</span></p>

<p><strong><span style="font-size:18px">Output:</span></strong><br>
<span style="font-size:18px">6<br>
8<br>
20</span></p>

<p><span style="font-size:18px"><strong>Explanation:</strong><br>
<strong>Testcase 1:</strong> Output contains 3 lines:<br>
In 1st line sum of two numbers is printed from the method add().<br>
In 2nd line multiplication of two nos is printed from the method mul().<br>
In 3rd line sum of the sqaures of the two nos is printed using your created method task().</span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Java</code>&nbsp;<code>OOP</code>&nbsp;