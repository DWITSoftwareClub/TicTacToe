import csv
from sklearn.tree import DecisionTreeClassifier
from sklearn.datasets.base import Bunch
import numpy as np


def load_data():
    """
    Parse the input CSV file to get data and target from user behaviour
    :return: Bunch data which contains feature train data, target data
    """
    with open('encoded.csv') as csv_file:
        data_file = csv.reader(csv_file)
        data = np.empty((64, 4), dtype=np.str)
        target = np.empty(64, dtype=np.int)

        for i, pl in enumerate(data_file):
            data[i] = np.asarray(pl[:-1], dtype=np.str)
            # print data[i]
            target[i] = np.asarray(pl[-1], dtype=np.int)

    return Bunch(data=data, target=target, feature_names=\
                                                ['Mood (str)', 'Gnere (str)',
                                                'Popularity (str)', 'Frequency (int)'])


def train():
    """
    The function to train the data.
    :return: DecisionTreeClassifier trained object
    """
    clf = DecisionTreeClassifier()
    allList = load_data()
    print allList

    # The input data matrix
    X = allList.data

    # The input target vector
    y = allList.target

    # Fit the training data in the classifier model
    clf = clf.fit(X, y)
    return clf


if __name__ == '__main__':
    """The main function to clas the module"""
    new_data = [[9, 98, 0, 1], [8, 97, 1, 1], [9, 96, 1, 0]]  # New input data

    trained_data = train()  # trained data

    print trained_data
    print trained_data.predict(new_data)
    print trained_data.predict_proba(new_data)
