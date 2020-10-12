package com.example.latihanrv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterContact extends RecyclerView.Adapter<AdapterContact.holderku> {
    private List<ModelContact> listContact;
    public AdapterContact(List<ModelContact> listContact){
        this.listContact = listContact;
    }
    @NonNull
    @Override
    public AdapterContact.holderku onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Hubungkan layout item contact ke adapter dan view holder
        View vh = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_rv,parent,false);
        return new holderku(vh);
    }
    @Override
    public void onBindViewHolder(@NonNull AdapterContact.holderku holder, int position) {
        ModelContact item =listContact.get(position);
        holder.txtNama.setText(item.getNama());
        holder.txtAlamat.setText(item.getAlamat());
    }
    @Override
    public int getItemCount() {
        return listContact.size();
    }
    public class holderku extends RecyclerView.ViewHolder{
        public TextView txtNama,txtAlamat;
        public holderku(@NonNull View itemView) {
            super(itemView);
            txtNama = itemView.findViewById(R.id.vnama);
            txtAlamat = itemView.findViewById(R.id.valamat);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(view,getAdapterPosition());
                }
            });
        }
    }//-----------------------------------------------
    private OnContactClickListener listener;
    public interface OnContactClickListener {
        public void onClick(View view, int position);
    }
    public void setListener(OnContactClickListener listener) {
        this.listener = listener;
    }
    //------------------------------------------------
}
