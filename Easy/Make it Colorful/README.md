<h2><a href="https://practice.geeksforgeeks.org/problems/make-it-colorful3522/1?page=1&category[]=pattern-printing&sortBy=submissions">Make it Colorful</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">In a party, there are 4 dress codes i.e. one can either wear Red(R) or Blue(B) or Green(G) or Yellow(Y). Photographer needs the most colorful picture possible, so he arranges people in a specific order like RGBYRGBY, RYBGRY, RYBGR, RGBYRGB but not in&nbsp;order like GGBRGBR, BGYBGY, GBGGBYR. Using the given information find out&nbsp;the number of people of a particular color required in the order (if there is a place for a particular color) to have the colorful picture.&nbsp;Given the order <strong>s</strong> you need to find out the required colour of every type. String lower than size 4&nbsp;always contains the pattern. (Here '!' means empty.)</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> s = YRGBYRGB
<strong>Output:</strong> R0G0B0Y0
<strong>Explaination:</strong> No colour is required as there 
is no empty space in the string.</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> s = !!!!RYGB
<strong>Output:</strong> R1G1B1Y1
<strong>Explaination:</strong> To maintain the order the sequence 
will be 'RYGBRYGB'.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print anything. Your task is to complete the function <strong>extraCount()</strong> which takes string s and returns a list containing the number of required R, G, B and Y respectively.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(|s|)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ |s| ≤ 1000&nbsp;</span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>pattern-printing</code>&nbsp;