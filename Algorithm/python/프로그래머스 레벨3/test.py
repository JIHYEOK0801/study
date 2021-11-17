from collections import deque
from itertools import permutations
from itertools import combinations
import heapq
import math
from itertools import combinations_with_replacement

a = ['1','2','3','4','5']
b = ','.join(a)
print(b)
c = '1 2 3 4 5'
d = c.split()
print(d)

a = 1.23456
b = round(a,3)
print(b)
print(math.ceil(a))
print(math.floor(a))

a = [1,2,3,4,5]
print(sum(a))
print(max(a))
print(min(a))
a = list(reversed(a))
print(a)

a = sorted(a)
print(a)

dic = dict()
dic['a'] = 'a'
print(dic['a'])
print('b' in dic)
print('a' in dic)

a = [('a',5),('b',4),('c',3),('d',2),('e',1)]
a.sort(key = lambda x : x[1], reverse = True)
print(a)