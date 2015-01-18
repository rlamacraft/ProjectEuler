class Node:
    value = None
    cValue = None

    def __init__(self, value, leftparent, rightparent, isroot):
        self.value = value

        if isroot:
            self.value = value
            self.cValue = value
        else:

            tmp = None
            if leftparent.cValue > rightparent.cValue:
                tmp = leftparent.cValue
            else:
                tmp = rightparent.cValue

            self.cValue = tmp + value


# Given a string containing a set of ints separated by spaces, this function returns the set of ints
def parse_input(input):
    output = []

    stringValues = input.split(' ')
    for eachNum in stringValues:
        output.append(int(eachNum))

    return output


# Given a list of ints, generates a list of nodes with parental cumumlative values
def create_list_of_nodes(input_values):
    current_row = []
    col_counter = 0
    for eachNum in input_values:
        if prevRow == []: # if first row, hence one node, which is the root
            return [Node(eachNum, 0, 0, True)]
        else:  # not the root row

            if col_counter == 0:  # first node in the list
                left_parent = Node(0, 0, 0, True)
                right_parent = prevRow[0]
            elif col_counter == len(input_values) - 1:  # last node in the list
                left_parent = prevRow[col_counter - 1]
                right_parent = Node(0, 0, 0, True)
            else:  # any other node in the list
                left_parent = prevRow[col_counter-1]
                right_parent = prevRow[col_counter]

            current_row.append(Node(eachNum, left_parent, right_parent, False))

        col_counter += 1;

    return current_row


# gets the max value in an array of nodes
def max(row):
    current_max = 0
    for eachNode in row:
        if eachNode.cValue > current_max:
            current_max = eachNode.cValue

    return current_max


prevRow = []

dataFile = open('triangle.txt', 'r')

for line in dataFile:  # for every line in the data file
    values = parse_input(line)

    prevRow = create_list_of_nodes(values)

print(max(prevRow))