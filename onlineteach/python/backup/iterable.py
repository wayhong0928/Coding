# Iterable 資料型態
# 字串、列表、集合、字典

# for 迴圈
# for 變數名稱 in 可疊代的資料：
for x in {"a","b",3,10}:
    print(x)
# 字典
dic={"a":3, "x":5}
for key in dic:
    print(key)
    print(dic[key]) # 字典的 value

# 內建函式
# max(可疊代資料)
result=max([10,2,30,1])
print(result)
result=max("xyz")
print(result)
result=max({10,200,30,1})
print(result)
result=max({"x":3,"a":4})
print(result)

# sorted(可疊代資料)
# 排序後用 list 方式呈現
result=sorted("cba")
print(result)
result=sorted({10,2,100,-5})
print(result)