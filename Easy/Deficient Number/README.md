<h2><a href="https://practice.geeksforgeeks.org/problems/deficient-number1612/1?page=1&category[]=series&sortBy=submissions">Deficient Number</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">â€‹Given a number x, your&nbsp;task is to find if this number is Deficient number or not. A number x&nbsp;is said to be Deficient Number if sum of all the divisors of the number denoted by&nbsp;<em>divisorsSum(x)</em>&nbsp;is less than twice the value of the number x. And the difference between these two values is called the&nbsp;<strong>deficiency</strong>.</span></p>

<p><span style="font-size:18px">Mathematically, if below condition holds the number is said to be Deficient:<br>
<strong>divisorsSum(x) </strong>&lt; 2*x<br>
<strong>deficiency</strong> = (2*x) - divisorsSum(x)<br>
<br>
<strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>: x = 21
<strong>Output:</strong>&nbsp;YES&nbsp;
<strong>Explanation</strong>: Divisors are 1, 3, 7 and
21.Sum of divisors is 32. 
This sum is less than 2*21 or 42.</span><span style="font-size:18px">
</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: x</strong> = 12
<strong>Output:&nbsp;</strong>NO
<strong>Explanation</strong>: Divisors are 1, 2, 3, 4,
6 and 12.Sum of divisors is 28.
This sum is not less than 2*12 or 24.
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You dont need to read input or print anything. Complete the function <strong>isDeficient</strong></span><span style="font-size:18px"><strong>()&nbsp;</strong>which takes x&nbsp;as input parameter and returns <strong>YES</strong> if the number is Deficient otherwise returns <strong>NO</strong>.<br>
<br>
<strong>Expected Time Complexity:</strong> O(sqrt(n))<br>
<strong>Expected Auxiliary Space:</strong> O(1)<br>
<br>
<strong>Constraints:</strong><br>
1&lt;= x&nbsp;&lt;=10000000</span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;<code>series</code>&nbsp;<code>Algorithms</code>&nbsp;