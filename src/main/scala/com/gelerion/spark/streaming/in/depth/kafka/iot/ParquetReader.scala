package com.gelerion.spark.streaming.in.depth.kafka.iot

import com.gelerion.spark.streaming.in.depth.Spark

object ParquetReader extends Spark {

  def main(args: Array[String]): Unit = {
    val targetPath = "enriched-sensors-data"

    spark.read.parquet(s"$targetPath/part-00000-503be4ec-61fc-4642-999f-f100e56c4a3d-c000.snappy.parquet")
      .show(false)

  }

}
