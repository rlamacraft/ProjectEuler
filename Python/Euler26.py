__author__ = 'Robert'


# returns the decimal part of a division, with l number of decimal places
def divide(n, d, l):
    result = ""
    while not n % d == 0 and l > 0:
        result += str(n / d)
        n = (n % d) * 10
        l -= 1
    result += str(n / d)
    return result[1:]


# checks if t is a repeating substring of s
def pattern_matching(s, t):
    offset = 0
    for eachChar in s:
        if not eachChar == t[offset]:
            return False
        offset += 1
        if offset >= len(t):
            offset = 0
    return True


# given a num, finds the longest repeating pattern
def find_repeating_pattern(s):
    for i in range(1, len(s)):
        if pattern_matching(s, s[0:i]):  # if found the repeating pattern, return its length
            return i
    return 0


MAX_D = 1000
TEST_MAX_D = 10
DECIMAL_PLACES = 2000
highest_rep_pat = 0
highest_rep_pat_num = 0
for eachNum in range(2, MAX_D):
    tmp = find_repeating_pattern(divide(1, eachNum, DECIMAL_PLACES))
    if tmp > highest_rep_pat and not tmp > DECIMAL_PLACES-10:
        highest_rep_pat = tmp
        highest_rep_pat_num = eachNum
    if eachNum % 10 == 0:
        print str(eachNum / 10) + "%"
print "100%"
print "answer: " + str(highest_rep_pat_num)