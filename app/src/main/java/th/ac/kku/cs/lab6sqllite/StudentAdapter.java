package th.ac.kku.cs.lab6sqllite;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyViewHolder>{
    private Context context;
    private List<Student> students;

    public class MyviewHolder extends RecyclerView.ViewHolder{
        public TextView idTextView;
        public TextView nameTextView;

        public MyviewHolder(View view){
            super(view);
            idTextView = view.findViewByLd()
        }
    }
}
