FizzBuzz Tasking:

1. 如果不是3、5、7的倍数，报原数字本身。
2. 如果是3的倍数，报Fizz。
3. 如果是5的倍数，报Buzz。
4. 如果是7的倍数，报Whizz。
5. 如果同时是3和5的倍数，报FizzBuzz。
6. 如果同时是3和7的倍数，报FizzWhizz。
7. 如果同时是5和7的倍数，报BuzzWhizz。
8. 如果同时是3、5和7的倍数，报FizzBuzzWhizz。
9. 如果报数包含3，那么忽略整除的规则，直接报Fizz。
10. 如果报数包含5，那么忽略包含3和被3整除的规则，对报数做被5和7整除的判定。     
   若包含5，且报数只能被5整除，返回Buzz；   
   若只能被7整除，返回Whizz；若能被5和7整除，返回BuzzWhizz；   
   若既不能被5，也不能被7整除，返回数字本身。
11. 如果报数包含7，忽略包含5和被5整除的判定。   
   若包含3，报Fizz；  
   若不包含3，则判断是否能被3和7整除：  
      若只能被3整除，报Fizz；   
      若只能被7整除报Whizz，若能被3和7整除报FizzWhizz；   
      若既不能被3整除也不能被7整除，返回数字本身。