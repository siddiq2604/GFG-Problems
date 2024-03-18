<h2><a href="https://www.geeksforgeeks.org/problems/next-right-node/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article">Next Right Node</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a Binary tree and a key in the binary tree, find the node right to the given key. If there is no node on right side, then return a node with value -1.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:

</span></strong>       <span style="font-size:18px">10
&nbsp;    /    \
&nbsp;   2      6
&nbsp;  / \      \
&nbsp; 8   4      5
and key = 2</span>
<strong><span style="font-size:18px">Output: 6</span></strong>
<strong><span style="font-size:18px">Explanation: </span></strong><span style="font-size:18px">We can see in the above tree</span>
<span style="font-size:18px">that the next right node of 2 is 6.</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:</span></strong>
      <span style="font-size:18px">10
&nbsp;   /     \
&nbsp;  2       6
&nbsp; / \       \
&nbsp;8   4       5
and key = 5</span>
<strong><span style="font-size:18px">Output: </span></strong><span style="font-size:18px">-1
</span><strong><span style="font-size:18px">Explanation: </span></strong><span style="font-size:18px">We can see in the above tree</span> 
<span style="font-size:18px">that there's No next right node of 5.
So, the output is -1.</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>nextRight()&nbsp;</strong>which takes root node of the tree and an integer <strong>key </strong>as input parameters and returns the next right node of the node with value<strong> key.</strong>&nbsp;</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=N&lt;=10<sup>3</sup><br>
1&lt;=data of node&lt;=10<sup>3</sup><br>
1&lt;=key&lt;=10<sup>3</sup></span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Traversal</code>&nbsp;<code>Queue</code>&nbsp;<code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;