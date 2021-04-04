package second.chapter3;

public interface Measurable {
    double getMeasurable();
    static double average(Measurable[] objects) {
        double avg = 0;
        for (Measurable item : objects) {
            avg += item.getMeasurable();
        }
        return avg / objects.length;
    }
    static Measurable largest(Measurable[] objects) {
        int j = 0;
        for (int i = 1; i < objects.length; ++i) {
            if (objects[i].getMeasurable() > objects[i-1].getMeasurable()) {
                j = i;
            }
        }
        return objects[j];
    }
}
