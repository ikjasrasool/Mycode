class Solution(object):
    def findWordsContaining(self, words, x):
        c=0
        li=list()
        for a in words:
            if x in a:
                li.append(c)
            c=c+1

        return li
        