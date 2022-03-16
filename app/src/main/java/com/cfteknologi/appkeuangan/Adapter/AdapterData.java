package com.cfteknologi.appkeuangan.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cfteknologi.appkeuangan.Models.DataModel;
import com.cfteknologi.appkeuangan.R;

import java.util.List;

public class AdapterData extends RecyclerView.Adapter<AdapterData.HolderData> {
    private final Context ctx;
    private final List<DataModel> listKeuangan;

    public AdapterData(Context ctx, List<DataModel> listKeuangan){
        this.ctx = ctx;
        this.listKeuangan = listKeuangan;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        HolderData holder = new HolderData(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        DataModel dm = listKeuangan.get(position);

        holder.tvId.setText((dm.getId()));
        holder.tvTanggal.setText((dm.getTanggal()));
        holder.tvPemasukan.setText((dm.getPemasukan()));
        holder.tvPengeluaran.setText((dm.getPengeluaran()));
        holder.tvKeterangan.setText((dm.getKeterangan()));
    }

    @Override
    public int getItemCount() {
        return listKeuangan.size();
    }

    public class HolderData extends RecyclerView.ViewHolder{
        TextView tvId, tvTanggal, tvPemasukan, tvPengeluaran, tvKeterangan;

        public HolderData(@NonNull View itemView){
            super(itemView);

            tvId            = itemView.findViewById(R.id.tv_id);
            tvTanggal       = itemView.findViewById(R.id.tv_tanggal);
            tvPemasukan     = itemView.findViewById(R.id.tv_pemasukan);
            tvPengeluaran   = itemView.findViewById(R.id.tv_pengeluaran);
            tvKeterangan    = itemView.findViewById(R.id.tv_keterangan);
        }
    }
}
