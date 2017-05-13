package id.sch.smktelkom_mlg.privateassignment.xirpl615.artikelku;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Joice Jessica on 5/13/2017.
 */

public class ArtikelAdapter extends RecyclerView.Adapter<ArtikelAdapter.ViewHolder> {
    private List<ArtikelList> artikelLists;
    private Context context;

    public ArtikelAdapter(List<ArtikelList> artikelLists, Context context) {
        this.artikelLists = artikelLists;
        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.artikel_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ArtikelList artikelList = artikelLists.get(position);
        holder.tvjudul.setText(artikelList.getJudul());
        holder.tvpopular.setText(artikelList.getPopular());


        Glide
                .with(context)
                .load(artikelList.getImage())
                .into(holder.ivimage);

    }

    @Override
    public int getItemCount() {
        if (artikelLists != null)
            return artikelLists.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivimage;
        TextView tvjudul;
        TextView tvpopular;

        public ViewHolder(View itemView) {
            super(itemView);
            ivimage = (ImageView) itemView.findViewById(R.id.imageView);
            tvjudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvpopular = (TextView) itemView.findViewById(R.id.textViewPopular);

        }
    }
}
