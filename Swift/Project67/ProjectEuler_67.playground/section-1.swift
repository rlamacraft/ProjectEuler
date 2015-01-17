import Foundation

//add String extension to support range access of ranges
extension String {
    subscript (r: Range<Int>) -> String {
        get {
            let startIndex = advance(self.startIndex, r.startIndex)
            let endIndex = advance(startIndex, r.endIndex - r.startIndex)
            return self[Range(start: startIndex, end: endIndex)]
        }
    }
}

class TreeNode {
    var value: Int
    var cmValue: Int
    
    init(value: Int, index: Int, isEnd: Bool) {
        self.value = value
        
        var firstParent: Int?
        var secondParent: Int?
        
        //get first parent
        if(index != 0) {
            firstParent = prevNodes[index-1]
        } else {
            self.cmValue = prevNodes[index] + value
            return
        }
        
        //get second parent
        if(!isEnd) {
            secondParent = prevNodes[index]
        } else {
            self.cmValue = prevNodes[index - 1] + value
            return
        }
        
        self.cmValue = (firstParent! < secondParent! ? secondParent! : firstParent!) + value
    }
}

//given a line of input, this function generates a list of its ints
func parseInputString(input: String) -> [Int] {
    let allStrings = input.componentsSeparatedByString(" ")
    var output : [Int] = []
    
    for eachString in allStrings {
        output.append(eachString.toInt()!)
    }
    
    return output
}

//given a list ints, this function will return the largest
func findMax(nums:[Int]) -> Int {
    var max = nums[0]
    for eachNum in nums {
        if eachNum > max {
            max = eachNum
        }
    }
    return max
}

func readFromFile() -> [String] {
    
    /*if let dirs = NSSearchPathForDirectoriesInDomains(NSSearchPathDirectory.DocumentDirectory, NSSearchPathDomainMask.AllDomainsMask, true) as?  [String] {
        let path = dirs[0].stringByAppendingPathComponent("triangle")*/
        let newPath = "/Users/Robert/Library/Containers/com.apple.dt.playground.stub.OSX.ProjectEuler-67-1F9572EB-5872-4BA8-9EEC-F8256FBDA686/Data/Documents/triangle.txt"

        //reading
        let text2 = String(contentsOfFile: newPath, encoding: NSUTF8StringEncoding, error: nil)!
        //return split(text2, {$0=="-"}, allowEmptySlices: false)
    //}
    
    return []
}

var prevNodes: [Int] = []
let testInput : [String] = readFromFile()

for var eachLine = 0; eachLine < testInput.count; eachLine++ {
    let currentNums = parseInputString(testInput[eachLine])
    
    if prevNodes == [] { //if first line of input
        prevNodes = currentNums
    } else {
        
        var currentNodes : [TreeNode] = []
        
        //create nodes
        for var index = 0; index < currentNums.count; index++ {
            if (index != currentNums.count-1) {
                currentNodes.append(TreeNode(value: currentNums[index],index: index,isEnd: false))
            } else {
                currentNodes.append(TreeNode(value: currentNums[index],index: index,isEnd: true))
            }
        }
        
        var newNodes : [Int] = []
        //replace previous nodes
        for eachNode in currentNodes {
            newNodes.append(eachNode.cmValue)
        }
        
        prevNodes = newNodes
    }
    
    if eachLine == testInput.count - 1 {
        print(findMax(prevNodes))
    }
}


