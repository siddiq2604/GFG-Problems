<h2><a href="https://practice.geeksforgeeks.org/problems/element-in-a-series0807/1?page=2&category[]=series&sortBy=submissions">Element in a Sequence</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Consider a sequence of numbers composed of only digits 4 and 7 such as 4, 7, 44, 47, 74,...... 44744,.. etc. Given a number <strong>N</strong>, we need to find&nbsp;the value of the</span><span style="font-size:18px">&nbsp;<strong>N</strong>-th element&nbsp;</span><span style="font-size:18px">in the sequence.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 3</span>
<span style="font-size:18px"><strong>Output:
</strong>44</span>
<span style="font-size:18px"><strong>Explanation:
</strong>Value of the first term = 4
Value of the second term = 7
Value of the third term = 44</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:
</span></strong><span style="font-size:18px">N = 5</span>
<strong><span style="font-size:18px">Output:
</span></strong><span style="font-size:18px">74</span>
<span style="font-size:18px"><strong>Explanation:
</strong>Value of the first term = 4
Value of the second term = 7
Value of the third term = 44
Value of the fourth term = 47
Value of the fifth term = 74
</span></pre>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong></span><br>
<span style="font-size:18px">You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>NthTermOfSeries()</strong>&nbsp;which takes an integer N as an input parameter and returns the value of the Nth term of the sequence.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 1000</span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;<code>series</code>&nbsp;<code>Algorithms</code>&nbsp;