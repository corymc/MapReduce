import java.util.*;

public class Node implements Writable {
	private LongWritable id;
	private ArrayList<LongWritable> children;
	private long distanceToSource;

	public Node(LongWritable id, long distanceToSource) {
		this.id = id;
		this.distanceToSource = distanceToSource;
	}

	public Node(LongWritable id, ArrayList<LongWritable> children, long distanceToSource) {
		this.children = children;
		this.distanceToSource = distanceToSource;
		visited = false;
	}

	public LongWritable getId() {
		return id;
	}

	public void setId(LongWritable id) {
		this.id = id;
	}

	public LongWritable getDistance() {
		return new LongWritable(this.distanceToSource);
	}

	public void setDistance(LongWritable dist) {
		this.distance = distance;
	}

	public ArrayList<LongWritable> getChildren() {
		return this.children;
	}

	public void setChildren(ArrayList LongWritable children) {
		this.children = children;
	}

	public boolean hasChildren() {
		return children.size() > 0;
	}

	public void write(DataOutput out) throws IOException {
		/*
        out.writeInt(exampleInt);
        
        // It's a good idea to store the length explicitly
        int length = 0;

        if (children != null){
            length = children.size();
        }

        // always write the length, since we need to know
        // even when it's zero
        out.writeInt(length);

        // now write each long in the array
        for (int i = 0; i < length; i++){
            out.writeLong(children[i]);
        }
        */
    }

    public void readFields(DataInput in) throws IOException {
        /*
        // example reading an int from the serialized object
        exampleInt = in.readInt();

        // example reading length from the serialized object
        int length = in.readInt();

        // Example of rebuilding the array from the serialized object
        exampleLongArray = new long[length];
        
        for(int i = 0; i < length; i++){
            exampleLongArray[i] = in.readLong();
        }
        */

    }
}